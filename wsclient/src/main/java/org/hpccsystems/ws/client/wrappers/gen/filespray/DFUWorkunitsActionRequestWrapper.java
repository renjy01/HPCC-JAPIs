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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUWorkunitsActionRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-29T20:02:35.027Z
 */
public class DFUWorkunitsActionRequestWrapper
{
protected List<String> local_wuids = new ArrayList<String>();
protected DFUWUActionsWrapper local_type;

	public DFUWorkunitsActionRequestWrapper() {}

	public DFUWorkunitsActionRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest dfuworkunitsactionrequest)
	{
		copy( dfuworkunitsactionrequest );
	}
	public DFUWorkunitsActionRequestWrapper( List<String> _wuids, DFUWUActionsWrapper _type )
	{
		this.local_wuids = _wuids;
		this.local_type = _type;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest raw )
	{
		if (raw == null)
			return;

		if (raw.getWuids() != null)
		{
			this.local_wuids = new ArrayList<String>();
			for ( int i = 0; i < raw.getWuids().getItem().length; i++)
			{
				this.local_wuids.add(new String(raw.getWuids().getItem()[i]));
			}
		}		this.local_type = new DFUWUActionsWrapper( raw.getType());

	}

	@Override
	public String toString()
	{
		return "DFUWorkunitsActionRequestWrapper [" + "wuids = " + local_wuids + ", " + "type = " + local_type + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest();
		if (this.local_wuids!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_wuids.size(); i++)
			{
				arr.addItem(this.local_wuids.get(i));
			}
			raw.setWuids(arr);
		}
		return raw;
	}


	public void setWuids( List<String> _wuids )
	{
		this.local_wuids = _wuids;
	}
	public List<String> getWuids( )
	{
		return this.local_wuids;
	}
	public void setType( DFUWUActionsWrapper _type )
	{
		this.local_type = _type;
	}
	public DFUWUActionsWrapper getType( )
	{
		return this.local_type;
	}
}