/*
 * Copyright 2017 Benedikt Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.britter.localdatequeryparameter;

import static java.util.stream.Collectors.toList;

import com.google.common.collect.ImmutableList;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

  private final List<Order> store = ImmutableList.<Order> builder()
      .add(new Order("4711", "Table", LocalDate.of(2017, 7, 12)))
      .add(new Order("4712", "Chair", LocalDate.of(2017, 7, 13)))
      .add(new Order("4713", "TV Set", LocalDate.of(2017, 7, 13)))
      .add(new Order("4714", "Couch", LocalDate.of(2017, 7, 19)))
      .build();

  public List<Order> findByOrderDate(LocalDate date) {
    Predicate<Order> byDate = o -> o.getOrderDate().isEqual(date);

    return store.stream()
            .filter(byDate)
            .collect(toList());
  }

}
