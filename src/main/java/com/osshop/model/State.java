/**
 * 
 */
package com.osshop.model;

import java.sql.*;
import java.util.Objects;

/**
 * @author Admin
 *
 */
public class State {

	private String stateCode;
	private String stateName;

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stateCode, stateName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(stateCode, other.stateCode) && Objects.equals(stateName, other.stateName);
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateCode=" + stateCode + "]";
	}

}
