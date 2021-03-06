package cft.commons.showcase.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

import org.apache.commons.lang.StringUtils;

/**
 * @author daniel
 *
 */
@Data
public class Role implements Serializable {

	private static final long serialVersionUID = 5706504143044155364L;

	private Integer roleId;
	private String name;
	private String permissions;
	private String status;
	private String remark;

	List<String> permissionList; // for UI checkbox component
	
	private Integer startIndex;
	private Integer endIndex;
	private Integer rows; //pageSize
	private Integer page; //pageNumber

	private String sidx; //sortColumn
	private String sord; //sortOrder

	
	public List<String> retrieveAllPermissions() {

		List<String> list = new ArrayList<String>();

		if (StringUtils.isNotBlank(permissions)) {
			list = Arrays.asList(StringUtils.split(permissions, ","));
		}
		return list;
	}

}
