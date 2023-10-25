import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://13.229.138.182:31517/member", "root", "69ddfa252ba84b9589e9a655229c6d97")
                .globalConfig(builder -> {
                    builder.author("Jiayu") // Set the author name
                            .fileOverride() // Override the files if they already exist
                            .outputDir(System.getProperty("user.dir") + "/mall-member/src/main/java") // Set the output directory
                            .enableSwagger(); // Enable Swagger
                })
                .dataSourceConfig(builder -> {
                    // You can add type convert handlers here if needed
                })
                .packageConfig(builder -> {
                    builder.parent("com.mall") // Set the parent package name
                            .moduleName("mallmember") // Set the module name
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/src/main/resources/mapper")); // Set the path for mapper XML files
                })
                .strategyConfig(builder -> {
                    builder.addInclude(
                                    "ums_member",
                                    "ums_member_collect_spu",
                                    "ums_member_login_log",
                                    "ums_member_receive_address",
                                    "ums_member_statistics_info"
                            ) // Set the table names
                            .addTablePrefix("ums_"); // Set the table prefix
                })
                .templateEngine(new FreemarkerTemplateEngine()) // Use Freemarker template engine
                .execute();
    }
}
