/* 
 * Copyright 2012-2017 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package com.netsteadfast.greenstep.vo;

import com.netsteadfast.greenstep.base.model.BaseValueObj;

public class TsaMeasureFreqVO extends BaseValueObj implements java.io.Serializable {
	private static final long serialVersionUID = 7810204716221179153L;
	private String oid;
	private String tsaOid;
	private String freq;
	private String startDate;
	private String endDate;
	private String dataType;
	private String orgId;
	private String empId;
	
	public TsaMeasureFreqVO() {
		
	}
	
	public TsaMeasureFreqVO(String oid, String tsaOid, String freq, String startDate, String endDate, String dataType,
			String orgId, String empId) {
		super();
		this.oid = oid;
		this.tsaOid = tsaOid;
		this.freq = freq;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dataType = dataType;
		this.orgId = orgId;
		this.empId = empId;
	}

	@Override
	public String getOid() {
		return this.oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}	

	public String getTsaOid() {
		return tsaOid;
	}

	public void setTsaOid(String tsaOid) {
		this.tsaOid = tsaOid;
	}

	public String getFreq() {
		return freq;
	}

	public void setFreq(String freq) {
		this.freq = freq;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
}
