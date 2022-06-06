package person.otj.friday_practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_menu", schema = "friday", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysMenu {

    @Id
    @Column(name = "menu_id")
    private Long menuId;

    @Basic
    @Column(name = "menu_name")
    private String menuName;

    @Basic
    @Column(name = "parent_id")
    private Long parentId;

    @Basic
    @Column(name = "order_num")
    private Integer orderNum;

    @Basic
    @Column(name = "path")
    private String path;

    @Basic
    @Column(name = "component")
    private String component;

    @Basic
    @Column(name = "is_frame")
    private Integer isFrame;

    @Basic
    @Column(name = "menu_type")
    private String menuType;

    @Basic
    @Column(name = "visible")
    private String visible;

    @Basic
    @Column(name = "perms")
    private String perms;

    @Basic
    @Column(name = "icon")
    private String icon;

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
        SysMenu sysMenu = (SysMenu) o;
        return Objects.equals(menuId, sysMenu.menuId) &&
                Objects.equals(menuName, sysMenu.menuName) &&
                Objects.equals(parentId, sysMenu.parentId) &&
                Objects.equals(orderNum, sysMenu.orderNum) &&
                Objects.equals(path, sysMenu.path) &&
                Objects.equals(component, sysMenu.component) &&
                Objects.equals(isFrame, sysMenu.isFrame) &&
                Objects.equals(menuType, sysMenu.menuType) &&
                Objects.equals(visible, sysMenu.visible) &&
                Objects.equals(perms, sysMenu.perms) &&
                Objects.equals(icon, sysMenu.icon) &&
                Objects.equals(createBy, sysMenu.createBy) &&
                Objects.equals(createTime, sysMenu.createTime) &&
                Objects.equals(updateBy, sysMenu.updateBy) &&
                Objects.equals(updateTime, sysMenu.updateTime) &&
                Objects.equals(remark, sysMenu.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuName, parentId, orderNum, path, component, isFrame, menuType, visible, perms, icon, createBy, createTime, updateBy, updateTime, remark);
    }



}
