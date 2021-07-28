package b.tech.localserver

import com.beust.jcommander.JCommander
import ws.osiris.localserver.ServerArgs
import ws.osiris.localserver.runLocalServer

import b.tech.core.api
import b.tech.core.config
import b.tech.core.createComponents

fun main(args: Array<String>) {
    val serverArgs = ServerArgs()
    JCommander.newBuilder().addObject(serverArgs).build().parse(*args)
    val components = createComponents()
    runLocalServer(api, components, config, serverArgs.port, serverArgs.root, "core/src/main/static")
}
