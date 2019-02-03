# apache-karaf

**Apache Karaf OSGI Provider**

**BND file for OSGI IMPL Provider**

BND is a eclipse plugin which can create the manifest dynamically

Manifest hold the OSGI configuration

_Some of the important property like

Require-Capability
Import-Package
Export-Package_

For Enabling the PAX CDI

Require-Capability will have the following entry
Require-Capability : osgi.extender; filter:="(osgi.extender=pax.cdi)"

OSGI Service Extension

Pax CDI also provides an integration with OSGi services, enabling you to reference an OSGi service or to publish an OSGi service using CDI annotations. This capability is provided by the Pax CDI OSGi Services Extension, which is not enabled by default.

For this project it has the following

**bndfile.bnd**
`
Bundle-Name: OSGI Provider
Require-Capability: org.ops4j.pax.cdi.extension; filter:="(&(extension=pax-cdi-extension)(version>=${version;==;${pax.cdi.version}})(!(version>=${version;=+;${pax.cdi.version}})))", osgi.extender; filter:="(osgi.extender=pax.cdi)"
Import-Package: javax.enterprise.*; version="1.0", *;
Export-Package: com.osgi.api`

Apache Karaf Installation of Bundle

Installing PAX CDI

Karaf Console
        __ __                  ____
       / //_/____ __________ _/ __/
      / ,<  / __ `/ ___/ __ `/ /_
     / /| |/ /_/ / /  / /_/ / __/
    /_/ |_|\__,_/_/   \__,_/_/

  Apache Karaf (4.0.8)

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown Karaf.

karaf@root()> feature:install pax-cdi


You can use the list command to list the bundles that show pax cdi  bundles

karaf@root()> list
START LEVEL 100 , List Threshold: 50
ID | State  | Lvl | Version | Name
-------------------------------------------------------------------------------------------------------
54 | Active |  80 | 1.0     | Apache Geronimo JSR-330 Spec API
55 | Active |  80 | 1.0.3   | Apache Geronimo Expression Language Spec 2.2
56 | Active |  80 | 1.0     | Interceptor 1.1
57 | Active |  80 | 1.0     | Apache Geronimo Java Contexts and Dependency Injection (JSR-299) Spec API
60 | Active |  80 | 4.1.0   | Apache XBean OSGI Bundle Utilities
61 | Active |  80 | 1.5.0   | OPS4J Base - All
62 | Active |  80 | 0.12.0  | OPS4J Pax CDI Bean Bundle API
63 | Active |  80 | 0.12.0  | OPS4J Pax CDI Extender for Bean Bundles
64 | Active |  80 | 0.12.0  | OPS4J Pax CDI Portable Extension for OSGi
65 | Active |  80 | 0.12.0  | OPS4J Pax CDI Service Provider Interface
66 | Active |  80 | 1.8.0   | OPS4J Pax Swissbox :: OSGi Core
67 | Active |  80 | 1.8.0   | OPS4J Pax Swissbox :: Lifecycle
68 | Active |  80 | 1.8.0   | OPS4J Pax Swissbox :: Tracker


Now let us install OSGI

install -s mvn  command used for installing the bundles from the mvn repository

karaf@root()> install -s mvn:osgi.example/osgi-example-osgi.api/1.0
Bundle ID: 70
karaf@root()>
karaf@root()> install -s mvn:osgi.example/osgi-example-osgi.provider/1.0
Bundle ID: 71

karaf@root()> list
START LEVEL 100 , List Threshold: 50
ID | State  | Lvl | Version | Name
-------------------------------------------------------------------------------------------------------
54 | Active |  80 | 1.0     | Apache Geronimo JSR-330 Spec API
55 | Active |  80 | 1.0.3   | Apache Geronimo Expression Language Spec 2.2
56 | Active |  80 | 1.0     | Interceptor 1.1
57 | Active |  80 | 1.0     | Apache Geronimo Java Contexts and Dependency Injection (JSR-299) Spec API
60 | Active |  80 | 4.1.0   | Apache XBean OSGI Bundle Utilities
61 | Active |  80 | 1.5.0   | OPS4J Base - All
62 | Active |  80 | 0.12.0  | OPS4J Pax CDI Bean Bundle API
63 | Active |  80 | 0.12.0  | OPS4J Pax CDI Extender for Bean Bundles
64 | Active |  80 | 0.12.0  | OPS4J Pax CDI Portable Extension for OSGi
65 | Active |  80 | 0.12.0  | OPS4J Pax CDI Service Provider Interface
66 | Active |  80 | 1.8.0   | OPS4J Pax Swissbox :: OSGi Core
67 | Active |  80 | 1.8.0   | OPS4J Pax Swissbox :: Lifecycle
68 | Active |  80 | 1.8.0   | OPS4J Pax Swissbox :: Tracker
70 | Active |  80 | 1.0.0   | osgi-example-osgi.api
71 | Active |  80 | 1.0.0   | OSGI Provider

