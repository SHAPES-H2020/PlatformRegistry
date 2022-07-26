package eu.h2020.symbiote.cloud.model.internal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFederatedResourceInfo is a Querydsl query type for FederatedResourceInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFederatedResourceInfo extends EntityPathBase<FederatedResourceInfo> {

    private static final long serialVersionUID = 1114917377L;

    public static final QFederatedResourceInfo federatedResourceInfo = new QFederatedResourceInfo("federatedResourceInfo");

    public final StringPath oDataUrl = createString("oDataUrl");

    public final StringPath restUrl = createString("restUrl");

    public final StringPath symbioteId = createString("symbioteId");

    public QFederatedResourceInfo(String variable) {
        super(FederatedResourceInfo.class, forVariable(variable));
    }

    public QFederatedResourceInfo(Path<? extends FederatedResourceInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFederatedResourceInfo(PathMetadata metadata) {
        super(FederatedResourceInfo.class, metadata);
    }

}

