package person.otj.friday_practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_config", schema = "friday", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SysConfig {

    @Id
    @Column(name = "config_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer configId;



    @Basic
    @Column(name = "config_name")
    private String configName;

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    @Basic
    @Column(name = "config_key")
    private String configKey;

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    @Basic
    @Column(name = "config_value")
    private String configValue;

    @Basic
    @Column(name = "config_type")
    private String configType;

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
        SysConfig sysConfig = (SysConfig) o;
        return Objects.equals(configId, sysConfig.configId) &&
                Objects.equals(configName, sysConfig.configName) &&
                Objects.equals(configKey, sysConfig.configKey) &&
                Objects.equals(configValue, sysConfig.configValue) &&
                Objects.equals(configType, sysConfig.configType) &&
                Objects.equals(createBy, sysConfig.createBy) &&
                Objects.equals(createTime, sysConfig.createTime) &&
                Objects.equals(updateBy, sysConfig.updateBy) &&
                Objects.equals(updateTime, sysConfig.updateTime) &&
                Objects.equals(remark, sysConfig.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, configName, configKey, configValue, configType, createBy, createTime, updateBy, updateTime, remark);
    }
}
