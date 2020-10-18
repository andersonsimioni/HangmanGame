package univali.andersonsimioni.Files;

import java.util.Map;

public class DeviceInformation {

    /**
     *  Return the name of device
     * @return
     */
    public static String getComputerName()
    {
        Map<String, String> env = System.getenv();

        if (env.containsKey("COMPUTERNAME"))
            return env.get("COMPUTERNAME");
        else if (env.containsKey("HOSTNAME"))
            return env.get("HOSTNAME");
        else
            return "Unknown Computer";
    }

}
