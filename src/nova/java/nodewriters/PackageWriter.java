package nova.java.nodewriters;

import net.fathomsoft.nova.tree.Package;

public abstract class PackageWriter extends NodeWriter
{
	public abstract Package node();
	
	@Override
	public StringBuilder writeExpression(StringBuilder builder)
	{
		return builder.append("package ").append(node().location.replace('/', '.'));
	}
}