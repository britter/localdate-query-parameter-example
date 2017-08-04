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

import java.time.LocalDate;
import java.util.Objects;

public class Order {

  private final String id;
  private final String description;
  private final LocalDate orderDate;

  public Order(String id, String description, LocalDate orderDate) {
    this.id = id;
    this.description = description;
    this.orderDate = orderDate;
  }

  public String getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(id, order.id) &&
        Objects.equals(description, order.description) &&
        Objects.equals(orderDate, order.orderDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, orderDate);
  }

  @Override
  public String toString() {
    return "Order{id='" + id + '\'' + ", description='" + description + '\'' + ", orderDate=" + orderDate + '}';
  }
}
