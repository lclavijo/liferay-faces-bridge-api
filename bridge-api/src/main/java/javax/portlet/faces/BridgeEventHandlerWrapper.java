/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package javax.portlet.faces;

import javax.faces.FacesWrapper;
import javax.faces.context.FacesContext;
import javax.portlet.Event;
import javax.portlet.faces.event.EventNavigationResult;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeEventHandlerWrapper implements BridgeEventHandler, FacesWrapper<BridgeEventHandler> {

	@Override
	public abstract BridgeEventHandler getWrapped();

	@Override
	public EventNavigationResult handleEvent(FacesContext facesContext, Event event) {
		return getWrapped().handleEvent(facesContext, event);
	}
}