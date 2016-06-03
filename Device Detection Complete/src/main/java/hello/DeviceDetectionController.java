package hello;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DeviceDetectionController {

	@RequestMapping("/detect-device")
	public @ResponseBody String detectDevice(Device device){
		String deviceType = "unknonwn";
		if (device.isNormal()){
			deviceType ="Desktop";
		} else if (device.isMobile()){
			deviceType = "Mobile";
		} else if (device.isTablet()){
			deviceType = "Tablet";
		}
		return "Hello " + deviceType + " browser!";
	}
}
