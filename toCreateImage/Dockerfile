FROM openjdk:8-jre-alpine

WORKDIR /home

ENV componentName "PlatformRegistry"
ENV componentVersion 3.0.4

#RUN apk --no-cache add \
#	git \
#	unzip \
#	wget \
#	bash \
#	&& echo "Downloading $componentName $componentVersion" \
#	&& wget "https://jitpack.io/com/github/symbiote-h2020/$componentName/$componentVersion/$componentName-$componentVersion-run.jar"



COPY ./PlatformRegistry-0.1.0-SNAPSHOT-run.jar PlatformRegistry-0.1.0-run.jar
EXPOSE 8203

#CMD java -DSPRING_BOOT_WAIT_FOR_SERVICES=symbiote-coreinterface:8100  -Xmx1024m -Duser.home=/home -Dspring.output.ansi.enabled=NEVER -jar $(ls *.jar)

CMD java $JAVA_HTTP_PROXY $JAVA_HTTPS_PROXY $JAVA_NON_PROXY_HOSTS -DSPRING_BOOT_WAIT_FOR_SERVICES=symbiote-aam:8080 -jar $(ls *run.jar)
