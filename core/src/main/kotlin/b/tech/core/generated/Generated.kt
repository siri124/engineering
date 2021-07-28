package b.tech.core.generated

import ws.osiris.aws.ApiFactory
import ws.osiris.aws.ApplicationConfig
import ws.osiris.aws.ProxyLambda
import ws.osiris.core.Api
import ws.osiris.core.ComponentsProvider

import b.tech.core.api
import b.tech.core.createComponents

/**
 * The lambda function that is deployed to AWS and provides the entry point to the application.
 *
 * This is generated code and should not be modified or deleted.
 */
@Suppress("UNCHECKED_CAST", "unused")
class GeneratedLambda : ProxyLambda<ComponentsProvider>(api as Api<ComponentsProvider>, createComponents())

/**
 * Creates the API and application configuration; used by the build plugins during deployment.
 *
 * This is generated code and should not be modified or deleted.
 */
@Suppress("UNCHECKED_CAST", "unused")
class GeneratedApiFactory<T : ComponentsProvider> : ApiFactory<T> {
    override val api: Api<T> = b.tech.core.api as Api<T>
    override val config: ApplicationConfig = b.tech.core.config
}
