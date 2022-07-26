package eu.h2020.symbiote.cloud.model.internal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFederationInfoBean is a Querydsl query type for FederationInfoBean
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QFederationInfoBean extends BeanPath<FederationInfoBean> {

    private static final long serialVersionUID = 503912832L;

    public static final QFederationInfoBean federationInfoBean = new QFederationInfoBean("federationInfoBean");

    public final StringPath aggregationId = createString("aggregationId");

    public final NumberPath<Double> resourceTrust = createNumber("resourceTrust", Double.class);

    public final MapPath<String, ResourceSharingInformation, SimplePath<ResourceSharingInformation>> sharingInformation = this.<String, ResourceSharingInformation, SimplePath<ResourceSharingInformation>>createMap("sharingInformation", String.class, ResourceSharingInformation.class, SimplePath.class);

    public QFederationInfoBean(String variable) {
        super(FederationInfoBean.class, forVariable(variable));
    }

    public QFederationInfoBean(Path<? extends FederationInfoBean> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFederationInfoBean(PathMetadata metadata) {
        super(FederationInfoBean.class, metadata);
    }

}

