/*
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package me.filoghost.chestcommands.util;

import java.util.*;

public final class Utils {

	private Utils() {
	}

	public static int makePositive(int i) {
		return i < 0 ? 0 : i;
	}

	public static boolean isValidInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isValidPositiveInteger(String input) {
		try {
			return Integer.parseInt(input) > 0;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isValidShort(String input) {
		try {
			Short.parseShort(input);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isValidPositiveDouble(String input) {
		try {
			return Double.parseDouble(input) > 0.0;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isClassLoaded(String name) {
		try {
			Class.forName(name);
			return true;
		} catch (Throwable t) {
			return false;
		}
	}

	public static boolean isNullOrEmpty(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}

}
