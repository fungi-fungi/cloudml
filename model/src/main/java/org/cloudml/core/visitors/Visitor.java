/**
 * This file is part of CloudML [ http://cloudml.org ]
 *
 * Copyright (C) 2012 - SINTEF ICT Contact: Franck Chauvel
 * <franck.chauvel@sintef.no>
 *
 * Module: root
 *
 * CloudML is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * CloudML is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with CloudML. If not, see
 * <http://www.gnu.org/licenses/>.
 */
/*
 */
package org.cloudml.core.visitors;

import org.cloudml.core.Artefact;
import org.cloudml.core.ArtefactInstance;
import org.cloudml.core.Binding;
import org.cloudml.core.BindingInstance;
import org.cloudml.core.ClientPort;
import org.cloudml.core.ClientPortInstance;
import org.cloudml.core.DeploymentModel;
import org.cloudml.core.Node;
import org.cloudml.core.NodeInstance;
import org.cloudml.core.Provider;
import org.cloudml.core.ServerPort;
import org.cloudml.core.ServerPortInstance;

/**
 * Behaviour required to traverse a deployment model
 */
public interface Visitor {

    public void addListeners(VisitListener... listeners);

    public void visitDeploymentModel(DeploymentModel subject);

    public void visitProvider(Provider subject);

    public void visitorNode(Node subject);

    public void visitClientPort(ClientPort subject);

    public void visitServerPort(ServerPort subject);

    public void visitArtefact(Artefact subject);

    public void visitBinding(Binding subject);

    public void visitNodeInstance(NodeInstance subject);

    public void visitArtefactInstance(ArtefactInstance subject);

    public void visitClientPortInstance(ClientPortInstance subject);

    public void visitServerPortInstance(ServerPortInstance subject);

    public void visitBindingInstance(BindingInstance subject);
}
