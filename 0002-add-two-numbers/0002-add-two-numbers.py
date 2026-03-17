class Solution:
    def addTwoNumbers(self, l1, l2):
        def linked(node):
            lst = []
            while node:
                lst.append(node.val)
                node = node.next
            return lst
        def list_to_link(lst):
            dummy = ListNode()
            curr = dummy
            for num in lst:
                curr.next = ListNode(num)
                curr = curr.next
            return dummy.next

        res1 = linked(l1)[::-1] 
        res2 = linked(l2)[::-1]  

        r1 = int("".join(map(str, res1))) 
        r2 = int("".join(map(str, res2)))  

        tot = r1 + r2 
        tot1 = list(map(int, str(tot)))[::-1]  

        return list_to_link(tot1) 
def list_to_linkedlist(lst):
    dummy = ListNode()
    current = dummy
    for num in lst:
        current.next = ListNode(num)
        current = current.next
    return dummy.next
def linkedlist_to_list(node):
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

l1 = list_to_linkedlist([2, 4, 3])
l2 = list_to_linkedlist([5, 6, 4])
sol = Solution()
result = sol.addTwoNumbers(l1, l2)

print(linkedlist_to_list(result)) 
