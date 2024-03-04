package org.taskmanagementsystem.validation;

import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.dto.StringDTO;

import java.util.ArrayList;
import java.util.List;

public abstract class Validator {
private List<Constraint> constraints;

public Validator()
{
        constraints = new ArrayList<>();
}

Validator addConstraint(Constraint checker)
{
        constraints.add(checker);

        return this;
}

static public boolean isOk(List<DTO> dto)
{
        DTO status = dto.get(0);

        return status.get("status").equals("OK");
}
List<DTO> validate(DTO request)
{
        List<DTO> result = new ArrayList<>();
        DTO status = new StringDTO();

        result.add(status);

        List<DTO> checkResult = constraints.stream()
                .map(c -> c.check(request))
                .filter(dto -> dto.get("status").equals("ERROR"))
                .toList();

        if(checkResult.isEmpty())
                status.set("status", "OK");
        else {
                status.set("status", "ERROR");
                result.addAll(checkResult);
        }

        return result;
}
}
