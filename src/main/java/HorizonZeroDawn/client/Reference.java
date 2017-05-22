package HorizonZeroDawn.client;

public class Reference {

	public static final String MOD_ID = "H0D";
	public static final String NAME = "Horizon Zero Dawn";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";

	public static final String CLIENT_PROXY_CLASS = "HorizonZeroDawn.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "HorizonZeroDawn.proxy.Proxy";

	
	
	public static enum HorizonItems{
		SPEAR("alloy_spear");
		
		
		private String unlocalizedName;
		//private String registryName;
		
		
		HorizonItems(String unlocalizedName){
			this.unlocalizedName = unlocalizedName;
			//this.registryName = registryName;
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
	/*	public String getRegistryName(){
			return registryName;
		}
		*/
		
	}
	
	
	
}
