package com.mall.mallproduct.mapper;

import com.mall.mallproduct.entity.SpuInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * spu信息 Mapper 接口
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Mapper
public interface SpuInfoMapper extends BaseMapper<SpuInfo> {

    /**
     * Select a SpuInfo based on its name.
     *
     * @param spuName the name of the SpuInfo
     * @return the SpuInfo found or null
     */
    @Select("SELECT * FROM pms_spu_info WHERE spu_name = #{spuName}")
    SpuInfo selectBySpuName(@Param("spuName") String spuName);

    @Select("SELECT * FROM pms_spu_info WHERE id = #{spuName}")
    SpuInfo selectBySpuId(@Param("spuName") String spuName);


    /**
     * Select SpuInfo based on publish status.
     *
     * @param publishStatus the publish status of the SpuInfo
     * @return a list of SpuInfo objects
     */
    @Select("SELECT * FROM pms_spu_info WHERE publish_status = #{publishStatus}")
    List<SpuInfo> selectByPublishStatus(@Param("publishStatus") Byte publishStatus);

    /**
     * Select SpuInfo created after a specific date and time.
     *
     * @param createTime the date and time to compare
     * @return a list of SpuInfo objects
     */
    @Select("SELECT * FROM pms_spu_info WHERE create_time > #{createTime}")
    List<SpuInfo> selectByCreateTimeAfter(@Param("createTime") LocalDateTime createTime);

    @Select("SELECT * FROM pms_spu_info WHERE seller_id = #{sellerId}")
    List<SpuInfo> selectBySellerId(@Param("seller_id") String sellerId);
}
