package org.taskmanagementsystem.session.router;

import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.session.server.TCPServer;

public class Router extends TCPServer {
public Router(int port)
{
        super(port);
}

@Override
public boolean run(DTO request, DTO response)
{
        return true;
}
}
