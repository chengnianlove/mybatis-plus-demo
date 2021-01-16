package com.cheng.mybatis;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * @author cheng
 */
@TableName("t_sys_config")
public class TSysConfig {

  @TableId(value = "oid", type = IdType.UUID)
  private String oid;
  private String code;
  private String name;
  private String memo;
  private String value;
  @TableField(value = "atta_oid")
  private String attaOid;
  @TableField(value = "is_able")
  private String isAble;
  @TableField(value = "is_delete")
  private String isDelete;
  @TableField(value = "parent_oid")
  private String parentOid;
  private String type;
  private String path;
  @TableField(value = "modify_date")
  private Date modifyDate;
  @TableField(value = "create_date")
  private Date createDate;


  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public String getAttaOid() {
    return attaOid;
  }

  public void setAttaOid(String attaOid) {
    this.attaOid = attaOid;
  }


  public String getIsAble() {
    return isAble;
  }

  public void setIsAble(String isAble) {
    this.isAble = isAble;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getParentOid() {
    return parentOid;
  }

  public void setParentOid(String parentOid) {
    this.parentOid = parentOid;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }

}
