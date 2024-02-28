package org.taskmanagementsystem.session.server;


import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.session.Endpoint;

public interface Server extends Endpoint {
        void start();
        boolean run(DTO request, DTO response);
}
