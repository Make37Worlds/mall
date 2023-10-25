import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class WarehouseCodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://13.229.138.182:31517/warehouse", "root", "69ddfa252ba84b9589e9a655229c6d97")
                .globalConfig(builder -> {
                    builder.author("Jiayu")
                            .fileOverride()
                            .outputDir(System.getProperty("user.dir") + "/mall-warehouse/src/main/java")
                            .enableSwagger();
                })
                .packageConfig(builder -> {
                    builder.parent("com.mall")
                            .moduleName("mallwarehouse")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/mall-warehouse/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(
                                    "wms_ware_info",
                                    "wms_ware_order_task",
                                    "wms_ware_order_task_detail",
                                    "wms_ware_sku"
                            )
                            .addTablePrefix("wms_");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
