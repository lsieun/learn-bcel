/**
 * 思路是这样的。
 * 在学习ClassFile和Opcode的时候，我觉得可能要经历这样三个过程：
 * <p>
 *     （1）Read。先去读取一个ClassFile文件，或者读取Opcode。
 * </p>
 * <p>
 *     （2）Write。接着，就是自己尝试着去写一写ClassFile和Opcode。
 * </p>
 * <p>
 *     （3）Modify。最后一个阶段，可能就是修改已经存在的ClassFile了。
 * </p>
 * <br/>
 * <p>另外，在每一个过程中（Read/Write/Modify），也可以从不同“认知颗粒度”来进行区分，例如：ClassFile/Field/Method/Code等。</p>
 */
package lsieun.bcel;