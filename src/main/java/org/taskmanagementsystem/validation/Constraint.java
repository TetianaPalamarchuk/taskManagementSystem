package org.taskmanagementsystem.validation;

import org.taskmanagementsystem.dto.DTO;

public interface Constraint {
        // returns:
        // DTO
        // - if the error has been found:
        //      status=ERROR message="............."
        // - if no errors:
        //      status=OK
        DTO check(DTO request);
}
