Apache Karaf Bundle Installation

karaf@root()> install  -s mvn:com.osgi/osgi-example-cmd/1.0

Now we can see that task and hit tab button it will list the command we registered in OSGI

task:get test

It invokes the @OsgiServiceProvider(classes = HelloService.class) which is implemented by HelloServiceImpl
It print the Hello Message on the console.
