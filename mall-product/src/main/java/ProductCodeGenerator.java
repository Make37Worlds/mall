import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class ProductCodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://13.229.138.182:31517/product", "root", "69ddfa252ba84b9589e9a655229c6d97")
                .globalConfig(builder -> {
                    builder.author("Jiayu")
                            .fileOverride()
                            .outputDir(System.getProperty("user.dir") + "/mall-product/src/main/java")
                            .enableSwagger();
                })
                .packageConfig(builder -> {
                    builder.parent("com.mall")
                            .moduleName("mallproduct")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/mall-product/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(
                                    "pms_attr",
                                    "pms_attr_group",
                                    "pms_brand",
                                    "pms_product_attr_value",
                                    "pms_sku_images",
                                    "pms_sku_info",
                                    "pms_spu_images",
                                    "pms_spu_info",
                                    "pms_spu_info_desc"
                            )
                            .addTablePrefix("pms_");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
