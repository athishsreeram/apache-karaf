import org.ops4j.pax.cdi.api.OsgiServiceProvider;
import org.ops4j.pax.cdi.api.Properties;
import org.ops4j.pax.cdi.api.Property;
import com.osgi.api.HelloService;

@OsgiServiceProvider(classes = HelloService.class)
@Properties(@Property(name = "service.exported.interfaces", value = "*"))
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, "+name;
    }
}