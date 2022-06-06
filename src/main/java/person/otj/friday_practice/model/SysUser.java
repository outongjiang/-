package person.otj.friday_practice.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import person.otj.friday_practice.baseModel.BaseModel;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
@Entity
@Table(name = "sys_user", schema = "friday", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysUser extends BaseModel {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "user_name")
    private String userName;

    @Basic
    @Column(name = "nick_name")
    private String nickName;

    @Basic
    @Column(name = "user_type")
    private String userType;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "phonenumber")
    private String phonenumber;

    @Basic
    @Column(name = "sex")
    private String sex;

    @Basic
    @Column(name = "avatar")
    private String avatar;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "status")
    private String status;

    @Basic
    @Column(name = "del_flag")
    private String delFlag;

    @Basic
    @Column(name = "login_ip")
    private String loginIp;

    @Basic
    @Column(name = "login_date")
    private Timestamp loginDate;

//    @Basic
//    @Column(name = "create_by")
//    private String createBy;
//
//    @Basic
//    @Column(name = "create_time")
//    private Timestamp createTime;
//
//    @Basic
//    @Column(name = "update_by")
//    private String updateBy;
//
//    @Basic
//    @Column(name = "update_time")
//    private Timestamp updateTime;
//    @Basic
//    @Column(name = "remark")
//    private String remark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(userId, sysUser.userId) &&
                Objects.equals(userName, sysUser.userName) &&
                Objects.equals(nickName, sysUser.nickName) &&
                Objects.equals(userType, sysUser.userType) &&
                Objects.equals(email, sysUser.email) &&
                Objects.equals(phonenumber, sysUser.phonenumber) &&
                Objects.equals(sex, sysUser.sex) &&
                Objects.equals(avatar, sysUser.avatar) &&
                Objects.equals(password, sysUser.password) &&
                Objects.equals(status, sysUser.status) &&
                Objects.equals(delFlag, sysUser.delFlag) &&
                Objects.equals(loginIp, sysUser.loginIp) &&
                Objects.equals(loginDate, sysUser.loginDate) ;

    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, nickName, userType, email, phonenumber, sex, avatar, password, status, delFlag, loginIp, loginDate);
    }
}
