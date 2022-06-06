package person.otj.friday_practice.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
@Entity
@Table(name = "sys_role", schema = "friday", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysRole {

    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Basic
    @Column(name = "role_name")
    private String roleName;

    @Basic
    @Column(name = "role_key")
    private String roleKey;

    @Basic
    @Column(name = "role_sort")
    private Integer roleSort;

    @Basic
    @Column(name = "data_scope")
    private String dataScope;

    @Basic
    @Column(name = "status")
    private String status;

    @Basic
    @Column(name = "del_flag")
    private String delFlag;
    @Basic
    @Column(name = "create_by")
    private String createBy;

    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;

    @Basic
    @Column(name = "update_by")
    private String updateBy;

    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    @Basic
    @Column(name = "remark")
    private String remark;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRole sysRole = (SysRole) o;
        return Objects.equals(roleId, sysRole.roleId) &&
                Objects.equals(roleName, sysRole.roleName) &&
                Objects.equals(roleKey, sysRole.roleKey) &&
                Objects.equals(roleSort, sysRole.roleSort) &&
                Objects.equals(dataScope, sysRole.dataScope) &&
                Objects.equals(status, sysRole.status) &&
                Objects.equals(delFlag, sysRole.delFlag) &&
                Objects.equals(createBy, sysRole.createBy) &&
                Objects.equals(createTime, sysRole.createTime) &&
                Objects.equals(updateBy, sysRole.updateBy) &&
                Objects.equals(updateTime, sysRole.updateTime) &&
                Objects.equals(remark, sysRole.remark);
    }
    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, roleKey, roleSort, dataScope, status, delFlag, createBy, createTime, updateBy, updateTime, remark);
    }
}
