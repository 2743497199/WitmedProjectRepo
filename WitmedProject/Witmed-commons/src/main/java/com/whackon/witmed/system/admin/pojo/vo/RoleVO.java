package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 系统用户角色视图信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = -8891884516513232086L;
	private Long id;                    // 主键
	private String code;                // 角色编码
	private String name;                // 角色名称
}