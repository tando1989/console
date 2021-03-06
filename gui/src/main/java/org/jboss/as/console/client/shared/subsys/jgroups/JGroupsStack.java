package org.jboss.as.console.client.shared.subsys.jgroups;

import org.jboss.as.console.client.widgets.forms.Binding;

import java.util.List;

/**
 * @author Heiko Braun
 * @date 2/16/12
 */
public interface JGroupsStack {

    String getName();
    void setName(String name);

    String getType();
    void setType(String type);

    @Binding(skip = true)
    String getTransportType();
    void setTransportType(String type);

    @Binding(skip = true)
    String getTransportSocket();
    void setTransportSocket(String type);

    @Binding(skip = true)
    List<JGroupsProtocol> getProtocols();
    void setProtocols(List<JGroupsProtocol> protocols);

    @Binding(skip = true)
    JGroupsTransport getTransport();
    void setTransport(JGroupsTransport transport);
}
