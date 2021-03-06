package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUWUActionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUActions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-29T20:02:35.030Z
 */
public class DFUWUActionsWrapper
{
protected String local_dFUWUActions;

	public DFUWUActionsWrapper() {}

	public DFUWUActionsWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUActions dfuwuactions)
	{
		copy( dfuwuactions );
	}
	public DFUWUActionsWrapper( String _dFUWUActions )
	{
		this.local_dFUWUActions = _dFUWUActions;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUActions raw )
	{
		if (raw == null)
			return;

//Warning raw class does not provide expected method: getDFUWUActions();

	}

	@Override
	public String toString()
	{
		return "DFUWUActionsWrapper [" + "dFUWUActions = " + local_dFUWUActions + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUActions getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUActions raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUWUActions(dFUWUActions);
		return raw;
	}


	public void setDFUWUActions( String _dFUWUActions )
	{
		this.local_dFUWUActions = _dFUWUActions;
	}
	public String getDFUWUActions( )
	{
		return this.local_dFUWUActions;
	}
}