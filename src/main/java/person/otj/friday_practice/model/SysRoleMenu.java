package person.otj.friday_practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_role_menu", schema = "friday", catalog = "")
@IdClass(SysRoleMenuPK.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysRoleMenu {



    @Id
    @Column(name = "role_id")
    private Long roleId;
    @Id
    @Column(name = "menu_id")
    private Long menuId;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleMenu that = (SysRoleMenu) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(menuId, that.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, menuId);
    }
}
