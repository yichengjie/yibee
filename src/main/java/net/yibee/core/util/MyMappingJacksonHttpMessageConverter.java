package net.yibee.core.util;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;


public class MyMappingJacksonHttpMessageConverter extends MappingJacksonHttpMessageConverter{
	public MyMappingJacksonHttpMessageConverter(){
	    ObjectMapper objectMapper = getObjectMapper();
	    objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
	    objectMapper.configure(SerializationConfig.Feature.WRITE_NULL_PROPERTIES, false);
	    //objectMapper.setSerializationInclusion(incl) ;
	    
	    //设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性  
	    //objectMapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);  
	    //objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);  
	    //objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));  
	  }

}