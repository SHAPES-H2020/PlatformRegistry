package eu.h2020.symbiote.cloud.model.internal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCloudResource is a Querydsl query type for CloudResource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCloudResource extends EntityPathBase<CloudResource> {

    private static final long serialVersionUID = -637817244L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudResource cloudResource = new QCloudResource("cloudResource");

    public final eu.h2020.symbiote.security.accesspolicies.common.QIAccessPolicySpecifier accessPolicy;

    public final QFederationInfoBean federationInfo;

    public final eu.h2020.symbiote.security.accesspolicies.common.QIAccessPolicySpecifier filteringPolicy;

    public final StringPath internalId = createString("internalId");

    public final StringPath pluginId = createString("pluginId");

    public final eu.h2020.symbiote.model.cim.QResource resource;

    public QCloudResource(String variable) {
        this(CloudResource.class, forVariable(variable), INITS);
    }

    public QCloudResource(Path<? extends CloudResource> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCloudResource(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCloudResource(PathMetadata metadata, PathInits inits) {
        this(CloudResource.class, metadata, inits);
    }

    public QCloudResource(Class<? extends CloudResource> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.accessPolicy = inits.isInitialized("accessPolicy") ? new eu.h2020.symbiote.security.accesspolicies.common.QIAccessPolicySpecifier(forProperty("accessPolicy")) : null;
        this.federationInfo = inits.isInitialized("federationInfo") ? new QFederationInfoBean(forProperty("federationInfo")) : null;
        this.filteringPolicy = inits.isInitialized("filteringPolicy") ? new eu.h2020.symbiote.security.accesspolicies.common.QIAccessPolicySpecifier(forProperty("filteringPolicy")) : null;
        this.resource = inits.isInitialized("resource") ? new eu.h2020.symbiote.model.cim.QResource(forProperty("resource")) : null;
    }

}

