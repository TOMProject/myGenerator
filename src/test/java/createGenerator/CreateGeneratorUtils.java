package createGenerator;


import com.fcore.entity.DbEntity;
import com.fcore.entity.FileEntity;
import com.fcore.entity.FlagEntity;
import com.fcore.service.CodeFactoryService;

public class CreateGeneratorUtils {


	public static void main(String[] args) {
		codeRun("base_station_info", "yeweigang", false, "127.0.0.1","base_station_management","root","1234");
	}
	/**
	 * 生成器方法入口
	 * @param tablename 表名
	 * @param author  作者
	 * @param isCover 是否覆盖之前的文件
	 * @param ip 数据库ip
	 * @param dbname  数据库名 方法中有数据库账号／密码／数据库端口，需要调整请修改
	 */
	private static void codeRun(String tablename, String author,
			boolean isCover, String ip, String dbname,String username,String pwd) {
		String basePackage = "com.station";
		String realPath = CreateGeneratorUtils.class.getResource("/").toString();
		realPath = realPath.substring(0, realPath.indexOf("/target/")) + "/";
		String projectPath = (realPath + "src/main/").replaceAll("file:", "");
		System.out.println("filepath:" + projectPath);
		try {
			DbEntity dbEntity = new DbEntity("com.mysql.jdbc.Driver","jdbc:mysql://" + ip + ":3306/" + dbname + "", username,pwd);
			// DbEntity dbEntity = new DbEntity("org.postgresql.Driver",
			// "jdbc:postgresql://"+ip+":5432/"+dbname+"", "ofbiz",
			// "ofbiz!#@$");
			FileEntity fileEntity = new FileEntity(projectPath, basePackage,author, isCover);
			FlagEntity flagEntity = new FlagEntity();
			// 控制不生成aciton web.xml page，默认为true
			flagEntity.setCreateAction(false);
			flagEntity.setCreateWebXml(false);
			flagEntity.setCreatePage(false);
			flagEntity.setCreatePropertie(false);
			flagEntity.setCreateService(true);
			flagEntity.setCreateDao(false);
			flagEntity.setCreateIDao(false);
			flagEntity.setCreateMapperXml(true);
			flagEntity.setCreateMapperJava(true);
			flagEntity.setCreateIservice(true);
			flagEntity.setCreateResult(true);
			flagEntity.setCreatePageBean(true);
			// 设置加载模版方式为从引用项目加载
			fileEntity.setTempateReadType(2);
			// 设置模版路径
			fileEntity.setTemplatePath("src/main/resources/ftl");
			CodeFactoryService.codeGenerateRun(tablename, dbEntity, fileEntity,flagEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
