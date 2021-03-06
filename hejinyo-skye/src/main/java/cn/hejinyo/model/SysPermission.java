package cn.hejinyo.model;

import cn.hejinyo.validator.RestfulValid;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    //权限编号 perm_id
    private Integer permId;

    //资源编码 res_code
    @NotBlank(message = "资源编码不能为空", groups = {RestfulValid.POST.class})
    private String resCode;

    //权限编码 perm_code
    @NotBlank(message = "权限编码不能为空", groups = {RestfulValid.POST.class})
    private String permCode;

    //权限名称 perm_name
    @NotBlank(message = "权限名称不能为空", groups = {RestfulValid.POST.class})
    private String permName;

    //资源URL perm_url
    @NotBlank(message = "资源URL不能为空", groups = {RestfulValid.POST.class})
    private String permUrl;

    //状态 0：正常；1：锁定；-1：禁用(删除) state
    private Integer state;

    //创建时间 create_time
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    //创建人员 create_id
    private Integer createId;
}