/*
 * @ClassName baseStationInfo
 * @Description 
 * @version 1.0
 * @Date 2018-05-12 17:54:17
 */
package com.station.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class BaseStationInfo extends BaseEntity implements Serializable{
    /**
     * @Fields id 
     */
    private Integer id;
    /**
     * @Fields gprsId 基站gprs ID
     */
    private String gprsId;
    /**
     * @Fields gprsIdOut 
     */
    private String gprsIdOut;
    /**
     * @Fields name 基站名称
     */
    private String name;
    /**
     * @Fields address 基站地址
     */
    private String address;
    /**
     * @Fields province 省
     */
    private String province;
    /**
     * @Fields city 市
     */
    private String city;
    /**
     * @Fields district 区
     */
    private String district;
    /**
     * @Fields lat 纬度 -90 to +90 (degrees)
     */
    private BigDecimal lat;
    /**
     * @Fields lng 经度  -180 to +180 (degrees)
     */
    private BigDecimal lng;
    /**
     * @Fields maintainanceId 运维ID
     */
    private String maintainanceId;
    /**
     * @Fields packType 电池组类型
     */
    private String packType;
    /**
     * @Fields roomType 机房类型
     */
    private String roomType;
    /**
     * @Fields duration 预测时长，单位分钟
     */
    private BigDecimal duration;
    /**
     * @Fields realDuration 剩余时长实时预测，单位分钟
     */
    private BigDecimal realDuration;
    /**
     * @Fields okNum 正常数量
     */
    private Integer okNum;
    /**
     * @Fields poorNum 较差数量
     */
    private Integer poorNum;
    /**
     * @Fields errorNum 故障数量
     */
    private Integer errorNum;
    /**
     * @Fields status 电池组性能 0:正常,1:较差, 2: 故障
     */
    private Integer status;
    /**
     * @Fields companyId1 一级公司id
     */
    private Integer companyId1;
    /**
     * @Fields companyId2 二级公司id
     */
    private Integer companyId2;
    /**
     * @Fields companyId3 三级公司id
     */
    private Integer companyId3;
    /**
     * @Fields delFlag 0未删除，1删除
     */
    private Integer delFlag;
    /**
     * @Fields companyName3 
     */
    private String companyName3;
    /**
     * @Fields volLevel 电压级别
     */
    private Integer volLevel;
    /**
     * @Fields operatorType 运营商类型,1移动，2联通，3电信
     */
    private Integer operatorType;
    /**
     * @Fields durationStatus 1优2良3中4差
     */
    private Integer durationStatus;
    /**
     * @Fields updateTime 
     */
    private Date updateTime;
    /**
     * @Fields loadPower 负载功率，单位为w，默认2400w。
     */
    private BigDecimal loadPower;
    /**
     * @Fields inspectStatus 安装、维护流程，电池组状态。 0:未安装，1:已安装，2:安装中，21:安装中等待确认状态，22:安装中后台确认未完成状态，3:维护中，31:维护中等待确认状态，32:维护中后台确认未完成状态
     */
    private Integer inspectStatus;
    /**
     * @Fields addressCoding 站址编号
     */
    private String addressCoding;
    /**
     * @Fields cellCount 电池总数
     */
    private Integer cellCount;
    /**
     * @Fields loadCurrent 负载电流
     */
    private BigDecimal loadCurrent;
    
    private boolean isGprsIdNotNull = false;
    /**
     * 连接状态
     */
    private Integer linkStatus;
	/**
	 * value = "电池状态： 充电,放电,浮充"
	 */
	private String state;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGprsId() {
        return gprsId;
    }

    public void setGprsId(String gprsId) {
        this.gprsId = gprsId == null ? null : gprsId.trim();
    }

    public String getGprsIdOut() {
        return gprsIdOut;
    }

    public void setGprsIdOut(String gprsIdOut) {
        this.gprsIdOut = gprsIdOut == null ? null : gprsIdOut.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getMaintainanceId() {
        return maintainanceId;
    }

    public void setMaintainanceId(String maintainanceId) {
        this.maintainanceId = maintainanceId == null ? null : maintainanceId.trim();
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType == null ? null : packType.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public BigDecimal getRealDuration() {
        return realDuration;
    }

    public void setRealDuration(BigDecimal realDuration) {
        this.realDuration = realDuration;
    }

    public Integer getOkNum() {
        return okNum;
    }

    public void setOkNum(Integer okNum) {
        this.okNum = okNum;
    }

    public Integer getPoorNum() {
        return poorNum;
    }

    public void setPoorNum(Integer poorNum) {
        this.poorNum = poorNum;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCompanyId1() {
        return companyId1;
    }

    public void setCompanyId1(Integer companyId1) {
        this.companyId1 = companyId1;
    }

    public Integer getCompanyId2() {
        return companyId2;
    }

    public void setCompanyId2(Integer companyId2) {
        this.companyId2 = companyId2;
    }

    public Integer getCompanyId3() {
        return companyId3;
    }

    public void setCompanyId3(Integer companyId3) {
        this.companyId3 = companyId3;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getCompanyName3() {
        return companyName3;
    }

    public void setCompanyName3(String companyName3) {
        this.companyName3 = companyName3 == null ? null : companyName3.trim();
    }

    public Integer getVolLevel() {
        return volLevel;
    }

    public void setVolLevel(Integer volLevel) {
        this.volLevel = volLevel;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getDurationStatus() {
        return durationStatus;
    }

    public void setDurationStatus(Integer durationStatus) {
        this.durationStatus = durationStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getLoadPower() {
        return loadPower;
    }

    public void setLoadPower(BigDecimal loadPower) {
        this.loadPower = loadPower;
    }

    public Integer getInspectStatus() {
        return inspectStatus;
    }

    public void setInspectStatus(Integer inspectStatus) {
        this.inspectStatus = inspectStatus;
    }

    public String getAddressCoding() {
        return addressCoding;
    }

    public void setAddressCoding(String addressCoding) {
        this.addressCoding = addressCoding == null ? null : addressCoding.trim();
    }

    public Integer getCellCount() {
        return cellCount;
    }

    public void setCellCount(Integer cellCount) {
        this.cellCount = cellCount;
    }

    public BigDecimal getLoadCurrent() {
        return loadCurrent;
    }

    public void setLoadCurrent(BigDecimal loadCurrent) {
        this.loadCurrent = loadCurrent;
    }

	public boolean isGprsIdNotNull() {
		return isGprsIdNotNull;
	}

	public void setGprsIdNotNull(boolean isGprsIdNotNull) {
		this.isGprsIdNotNull = isGprsIdNotNull;
	}

	public Integer getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(Integer linkStatus) {
		this.linkStatus = linkStatus;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
    
}