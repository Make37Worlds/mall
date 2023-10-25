import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class OrderCodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://13.229.138.182:31517/order", "root", "69ddfa252ba84b9589e9a655229c6d97")
                .globalConfig(builder -> {
                    builder.author("Jiayu")
                            .fileOverride()
                            .outputDir(System.getProperty("user.dir") + "/mall-order/src/main/java")
                            .enableSwagger();
                })
                .packageConfig(builder -> {
                    builder.parent("com.mall")
                            .moduleName("mallorder")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/mall-order/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(
                                    "oms_order",
                                    "oms_order_item",
                                    "oms_order_operate_history",
                                    "oms_order_return_reason",
                                    "oms_order_setting",
                                    "oms_payment_info",
                                    "oms_refund_info"
                            )
                            .addTablePrefix("oms_");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}

