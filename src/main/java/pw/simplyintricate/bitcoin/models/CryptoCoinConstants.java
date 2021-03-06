/*
 * lib-bitcoinj
 * Copyright (c) 2014, Stephen Liang, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this library.
 */

package pw.simplyintricate.bitcoin.models;

import com.google.common.primitives.UnsignedInteger;

/**
 * Constants for this client
 */
public class CryptoCoinConstants {
    public static final UnsignedInteger SERVICES = UnsignedInteger.fromIntBits(1);
    public static final String USER_AGENT = "bitcoin-notify 0.1";

    private CryptoCoinConstants() {
    }
}
