/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.runners.core;

import java.io.Closeable;

/**
 * A receiver of streamed data.
 *
 * <p>Provide a {@link FnDataReceiver} and target to a {@link FnDataService} to listen for incoming
 * data.
 *
 * <p>Register a target with a {@link FnDataService} to gain a {@link FnDataReceiver} to which you
 * may write outgoing data.
 */
public interface FnDataReceiver<T> extends Closeable {
  void accept(T input) throws Exception;
}
