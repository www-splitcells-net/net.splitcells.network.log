/* SPDX-License-Identifier: EPL-2.0 OR GPL-2.0-or-later
 * SPDX-FileCopyrightText: Contributors To The `net.splitcells.*` Projects
 */
package net.splitcells.network.log;

import net.splitcells.dem.environment.config.framework.OptionImpl;
import net.splitcells.dem.lang.tree.Tree;
import net.splitcells.dem.resource.FileSystem;
import net.splitcells.dem.resource.FileSystemView;

import java.util.Optional;

import static net.splitcells.dem.lang.tree.TreeI.tree;
import static net.splitcells.dem.resource.FileSystemViaClassResources.fileSystemViaClassResources;
import static net.splitcells.dem.resource.FileSystemWriteWrapper.fileSystemWriteWrapper;

public class NetworkLogFileSystem extends OptionImpl<FileSystem> {
    public NetworkLogFileSystem() {
        super(() -> fileSystemWriteWrapper(fileSystemViaClassResources(NetworkLogFileSystem.class, "net.splitcells", "network.log")));
    }
    @Override public Optional<Tree> serialize(FileSystem currentValue) {
        return Optional.of(tree(currentValue.toString()));
    }
}
