package io.vertx.test.codegen.testapi;

import io.vertx.codegen.annotations.VertxGen;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface MethodWithDataObjectParam {

  void methodWithDataObjectParam(PlainDataObject dataObject);
}
