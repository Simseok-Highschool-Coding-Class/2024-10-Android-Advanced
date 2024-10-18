package space.doky.andadv1.network.repository.datasource.interceptor

import okhttp3.Interceptor
import okhttp3.Protocol
import okhttp3.Response

class WebClientMockInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        // TODO: make mock for test
        return Response.Builder()
            .request(chain.request())
            .protocol(Protocol.HTTP_2)
            .build()
    }
}