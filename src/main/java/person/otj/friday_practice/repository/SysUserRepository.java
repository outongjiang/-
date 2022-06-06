package person.otj.friday_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import person.otj.friday_practice.model.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser,Long> {

}
