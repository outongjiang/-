package person.otj.friday_practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysRoleMenuPK implements Serializable {



    @Column(name = "role_id")
    @Id
    private Long roleId;

    @Column(name = "menu_id")
    @Id
    private Long menuId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleMenuPK that = (SysRoleMenuPK) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(menuId, that.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, menuId);
    }
}
