package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * ï¿½ï¿½Ô±ï¿½Õ²Øµï¿½ï¿½ï¿½Æ·
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("ums_member_collect_spu")

public class MemberCollectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private Long spuId;

    private String spuName;

    private String spuImg;

    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuImg() {
        return spuImg;
    }

    public void setSpuImg(String spuImg) {
        this.spuImg = spuImg;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "MemberCollectSpu{" +
            "id = " + id +
            ", memberId = " + memberId +
            ", spuId = " + spuId +
            ", spuName = " + spuName +
            ", spuImg = " + spuImg +
            ", createTime = " + createTime +
        "}";
    }
}
