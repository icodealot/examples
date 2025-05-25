## Context

This sample code is based on a post you can read here:

https://icodealot.com/oracle-jdbc-config-provider-for-oci-database-tools-service/

## Additional notes:

I tested this with JDK 21 and everything worked at the time I wrote the above post. That said, things move fast
in the Java dependency world and versions change often. Update accordingly.

See also `pom.xml` where I added:

- Explicit dependencies for things I wanted to override. (version-wise)
- A no-op logging implementation to silence sfl4j logs that come with OCI SDK usage