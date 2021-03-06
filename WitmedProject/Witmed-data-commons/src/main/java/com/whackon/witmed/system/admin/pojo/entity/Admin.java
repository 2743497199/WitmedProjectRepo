package com.whackon.witmed.system.admin.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import com.whackon.witmed.system.dictionary.pojo.entity.Identity;
import com.whackon.witmed.system.hospital.pojo.entity.Department;
import lombok.Data;

/**
 * <b>系统功能 - 系统用户实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 4226492550883944160L;
	private String id;                          //主键
	private String no;                          //人员工号
	private String name;                        //人员姓名
	private String cellphone;                   //联系电话
	private String password;                    //登陆密码
	private Role role;                          //人员角色
	private Identity identity;                  //人员身份
	private Department department;              //所属部门
	private String technicalPos;                //服务者专业技术职务（职称）
	private String education;                   //服务者学历
	private String professionalName;            //服务者所学专业
	private String technicalPosRank;            //服务者专业技术职务（职称）等级
}